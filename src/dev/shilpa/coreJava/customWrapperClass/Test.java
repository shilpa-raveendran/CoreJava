package dev.shilpa.coreJava.customWrapperClass;

// Wrapper Class
class Maximum {

    private int maxi=0;
    private int size=0;

    public void insert(int x){
      this.size++;
      if( x <=this.maxi){
          return;
      }else{
          this.maxi=x;
      }
    }

    public int top(){
        return this.maxi;
    }

    public int elementNumber(){
        return this.size;
    }

    public class Test{
        public static void main(String[] args) {

            Maximum max= new Maximum();
            max.insert(12);
            max.insert(3);
            max.insert(788);
            max.insert(55);

            System.out.println("Max element: "+ max.top());
            System.out.println("No of elements inserted: "+max.elementNumber());

        }
    }

}
