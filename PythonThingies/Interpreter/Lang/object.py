from abc import(
    ABC, 
    abstractmethod
)

from enum import(
    auto,
    Enum
)

class ObjectType(Enum):
    BOOLEAN = auto()
    INTEGER = auto()
    NULL = auto()
    STRING = auto()
    
class Object(ABC):  #ABC dice que esto es una clase abstracta
    @abstractmethod
    def type(self)-> ObjectType:
        pass

    @abstractmethod
    def inspect(self)->str:
        pass
    
    class Integer(Object):
        def __init__(self, value: int)->None:
            self.value = value

        def type(self)-> ObjectType:
            return ObjectType.INTEGER

        def inspect(self)->str:
            return str(self.value)