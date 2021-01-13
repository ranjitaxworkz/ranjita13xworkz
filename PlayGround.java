class PlayGround
{
   int id;
   String name;
   String address;
   String type;
void playing()
{

 System.out.println("playing Cricklet");

}
public static void main(String a[])
{
  PlayGround pg=new PlayGround();
  pg.name="SB Ground";
  pg.id=76;
  pg.address="Busstand Road";
  pg.type="gorv";
  System.out.println("\n"+pg.name+"\n"+pg.id+"\n"+pg.address+"\n"+pg.type);
  pg.playing();
}
}

 

   