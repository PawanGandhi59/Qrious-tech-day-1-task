public class problem10 {
    public static void main(String[] args) {
        drink[] drinks={
               new drink("lemonade",50),
                new drink("lime",10),
                new drink("sprite",40),
                new drink("water",40)
        };
        for(int i=0;i<drinks.length-1;i++){
            for(int j=0;j< drinks.length-i-1;j++){
                if(drinks[j].price>drinks[j+1].price){
                    drink temp=drinks[j];
                    drinks[j]=drinks[j+1];
                    drinks[j+1]=temp;
                }
            }
        }
        for(drink d:drinks){
            System.out.println("Name: "+d.name+",Price: "+d.price);
        }
    }
}
class drink{
  String name;
  double price;
  drink(String n,double p){
      this.name=n;
      this.price=p;
  }
}
