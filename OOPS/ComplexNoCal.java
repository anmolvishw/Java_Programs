package OOPS;



// user Class declare 
class complex{
    int real;
    int img;

    public complex (int real,int img){
        this.real = real;
        this.img = img;
    }

   public static complex sum(complex c1, complex c2){
        return new complex((c1.real+c2.real),(c1.img+c2.img));
    }

    public static complex product(complex c1, complex c2){
        return new complex((c1.real*c2.real)-(c1.img*c2.img),(c1.real*c2.img)+(c1.img*c2.img));
    }

    public static complex diffrence(complex c1, complex c2){
        return new complex((c1.real-c2.real),(c1.img-c2.img));
    }

        
    void print(){
        System.out.println(" "+real+" + "+img+"i");
    }
}

//
class ComplexNoCalculation {
    public static void main(String[] args) {
        complex c1 = new complex(4,5);
        c1.print();
        complex c2 = new complex(5,4);
        c2.print();

        // complex c3 = new complex.sum(c1,c2); // something-went wrong 
        // c3.print();
    }
}