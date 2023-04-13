public class Enums{
    public static void main(String[] args){
        IpKind ipkind1 = IpKind.Ipv4;
        IpKind ipkind2 = IpKind.Ipv6;
        //In class for addr
        IpAdress ip1 = new IpAdress(ipkind1, "127.0.0.1");
        IpAdress ip2 = new IpAdress(ipkind2, "::1");
        //
    }


}
enum IpKind{
    Ipv4,
    Ipv6
}

class IpAdress{
    public IpKind ipkind;
    public String addr;

    public IpAdress(IpKind kind, String addr){
        ipkind = kind;
        this.addr = addr;
    }
}