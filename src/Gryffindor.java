public class Gryffindor extends Hogwarts {
   private int nobility;//благородство
   private int honor;//честь
   private int bravery;//храбрость

   public Gryffindor(String name,
                     int witchcraft,
                     int movementSpace,
                     int nobility,
                     int honor,
                     int bravery) {
      super(name, witchcraft, movementSpace);
      this.nobility = nobility;
      this.honor = honor;
      this.bravery = bravery;
   }

   public int getNobility() {
      return nobility;
   }

   public int getHonor() {
      return honor;
   }

   public int getBravery() {
      return bravery;
   }

   public void setNobility(int nobility) {
      this.nobility = nobility;
   }

   public void setHonor(int honor) {
      this.honor = honor;
   }

   public void setBravery(int bravery) {
      this.bravery = bravery;
   }
   public int qualities(){
      return nobility + honor + bravery;
   }
   public void  qualitiesGryffindor(Gryffindor gryffindor){
      int qualities1 = qualities();
      int qualities2 = gryffindor.qualities();
      if(qualities1<qualities2){
         System.out.println("Студент " +getName()+
                 " лучше, чем Гриффиндорец " +gryffindor.getName()+
                 " : " +qualities2+ " против "
                 +qualities1);
      }
      else if(qualities1>qualities2){
         System.out.println("Гриффиндорец " +gryffindor.getName()+
                 " лучше, чем студент " +getName()+
                 " : " +qualities1+ " против "
                 +qualities2);
      }
      else {
         System.out.println("Гриффиндорец " +gryffindor.getName()+
                 " идентичный студенту " +getName()+
                 " : " +qualities1+ " против "
                 +qualities2);;
      }

   }

   @Override
   public String toString() {
      return String.format("Студент " +getName()+
              " - благородство = " + nobility +
              ", честь = " + honor +
              ", храбрость = " + bravery,
              super.toString()
      );
   }
}
