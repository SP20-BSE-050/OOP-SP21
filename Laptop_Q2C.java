public class Laptop_Q2C extends Computer_lab08_Q2 {
    private int length_in_inches;
    private int width_in_inches;
    private int height_in_inches;
    private int weight_in_inches;

    public Laptop_Q2C(){
        super();
    }

    public Laptop_Q2C(int WordSize_in_bit, int MemorySize_in_MB, int StorageSize_in_MB, double Speed_in_MH, int length_in_inches, int width_in_inches, int height_in_inches, int weight_in_inches){
        super(WordSize_in_bit,MemorySize_in_MB,StorageSize_in_MB,Speed_in_MH);
        this.length_in_inches = length_in_inches;
        this.width_in_inches = width_in_inches;
        this.height_in_inches = height_in_inches;
        this.weight_in_inches = weight_in_inches;
    }

    public void setLength(int length_in_inches){ this.length_in_inches = length_in_inches; }
    public int getLength(){ return length_in_inches; }

    public void setWidth(int width_in_inches){ this.width_in_inches = width_in_inches; }
    public int getWidth(){ return width_in_inches; }

    public void setHeight(int height_in_inches){ this.height_in_inches = height_in_inches;}
    public int getHeight(){ return height_in_inches;}

    public void setWeight(int weight_in_inches){ this.weight_in_inches = weight_in_inches;}
    public int getWeight(){ return weight_in_inches;}



    public void display(){
        System.out.println("\nLaptop; "+"\nWord Size(Bits)= "+WordSize_in_bit+"\nMemory Size(MB)= "+MemorySize_in_MB+
                "\nStorage Size(MB)= "+StorageSize_in_MB+ "\nSpeed(MH)= "+Speed_in_MH+
               "\nLength in inches= "+length_in_inches+"\nWidth in inches= "+width_in_inches+"\nHeight in inches= "+height_in_inches+ "\nWeight in kg= "+weight_in_inches);
    }



}


