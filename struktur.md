Motivierende Beispiele Traits
conditional implementation based on other traits
# Motivierende Beispiele Enums
## allgemeines zu enums
## allgemeines zu enums in rust
## Modellierung von IPv6 und IPv4 vergleich java und rust
In Java braucht man für die Modellierung 2-3 Klassen.
z.B Abstract IP. IPv6 extends IP, IPv4 extends IP.
In Rust kann dies durch ein einfaches Enum ausgedrückt werden.
Bspw 
```rust
enum Ip{
	V4(u8, u8, u8, u8),
	V6(String)
}
let loopback1 = Ip::V4(127,0,0,1)
let loopback2 = Ip::V6(":1")
```
```java
//pseudo
abstract class Ip{
	... //was wollen wir hier eigentlich. Typen zu unterschiedlich!
	//evtl beide mit string?
	
}

class Ipv4 extends{
	public Short[] ip = new Short[4];
	public Ipv4(Short[] ip ...){
		//check if valid no unsigned byte
		...
	}
}

class Ipv6 extends Ip{
	public String ip;
	public Ipv4(String ip){
		//check if valid no unsigned byte
		...
	}
}
var loopback1 = new Ipv4(
var loopback2 = Ip::V6(":1")
```
## Match Statement mit enums
Sehr angenehm zum programmieren. Programmfluss wird dadurch verständlicher und sicherer.
Java alternative wäre mit instance of zu checken um was es sich handelt und so Fälle abzuwickeln. Worst case default. Was passiert hier?

## Taiming the null point with the Option enum

# Traits
## Motivierende Beispiele Traits
## Traits als Rückgabewerte
## Implementieren Konditioneller Funktionen mit Traits
## Supertraits




# weiteres vorgehen
- Motivierende Beispiele fuer traits und enums. Vlt sogar bekannte Problemstellung aus einer Vorlesung
- Struktur der Ausarbeitung
