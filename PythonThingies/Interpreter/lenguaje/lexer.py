from re import match

from lenguaje.token import(
    Token,
    TokenType
)

"""
    El lexer es el que identifica cual token es y luego se pasa para generar el árbol y ser evaluado
"""

class Lexer:
    """
    Se inicializan las varaibles para utilizar en la clase
    """
    def __init__(self, text:str) -> None:
        self.text = text
        self.__current__pos = 0
        self.current_char = ""
        
        self._read_pos = 0
        self._read_character()
    """
    Se asigna el token y se lee el siguiente caracter
    """
    def _read_character(self) -> None:
        if self._read_pos >= len(self.text):
            self.current_char = ""
        else:
            self.current_char = self.text[self.__current__pos]
        self.__current__pos = self._read_pos
        self._read_pos += 1
    """
    Se evitan espacios en blanco y se lee el siguiente caracter
    """
    def _skip_whitespace(self) -> None:
        while self.current_char.isspace():
            self._read_character()
    """
    Evalúa cada token y devuelve su tipo
    """
    def next_token(self):
        self._skip_whitespace()
        if match(r'^=$', self.current_char):
            token = Token(TokenType.ASSIGN, self.current_char) 
        elif match(r'^\+$', self.current_char):
            token = Token(TokenType.PLUS, self.current_char)
        elif match(r'^,$', self.current_char):
            token = Token(TokenType.COMMA, self.current_char)
        elif match(r'^;$', self.current_char):
            token = Token(TokenType.SEMICOLON, self.current_char)
        elif match(r'^$', self.current_char):
            token = Token(TokenType.EOF, self.current_char)
        else:
            token = Token(TokenType.ILLEGAL, self.current_char)  
        self._read_character()
        return token
