from typing import List

from Lang.ast import Program
from Lang.evaluator import evaluate
from Lang.lexer import Lexer
from Lang.object import Environment
from Lang.parser import Parser
from Lang.token import (
    Token,
    TokenType,
)


EOF_TOKEN: Token = Token(TokenType.EOF, '')


def _print_parse_errors(errors: List[str]):
    for error in errors:
        print(error)

def start_repl() -> None:
    #Se hace esto para que sea multilinea y guarden todos los datos no solo de una línea
    scanned: List[str] = []

    while (source := input('>> ')) != 'salir()':
        scanned.append(source)
        lexer: Lexer = Lexer(' '.join(scanned))
        parser: Parser = Parser(lexer)

        program: Program = parser.parse_program()
        env: Environment = Environment()

        if len(parser.errors) > 0:
            _print_parse_errors(parser.errors)
            continue

        evaluated = evaluate(program, env)

        if evaluated is not None:
            print(evaluated.inspect())