from lenguaje.token import (
    Token, 
    TokenType
)
from lenguaje.lexer import Lexer 

def start_repl():
    print("Wilkommen")
    while (text:=input(">>> ")) != "salir":
        lexer = Lexer(text)
        while (token := lexer.next_token()) != Token(TokenType.EOF, ""):
            print(token)