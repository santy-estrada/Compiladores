from enum import(
    Enum,
    auto, 
    unique
)

from typing import(
    Dict,
    NamedTuple
)

"""
    Se crea la clase TokenType para definir los tipos de tokens
    Cada token es único y su identificador no se repite
"""
@unique
class TokenType(Enum):
    ASSIGN = auto()
    COMMA = auto()
    PLUS = auto()
    SEMICOLON = auto()
    ILLEGAL = auto()
    EOF = auto()
    
"""
    Se crea la clase TokenType para definir los tipos de tokens
    Cada token es único y su identificador no se repite
"""
    
class Token(NamedTuple):
    token_type: TokenType
    literal: str

    def __str__(self) -> str:
        return f'{self.token_type} : {self.literal}'