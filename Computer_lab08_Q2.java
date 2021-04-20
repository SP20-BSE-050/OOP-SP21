public class Computer_lab08_Q2 {
    protected int WordSize_in_bit;
    protected int MemorySize_in_MB;
    protected int StorageSize_in_MB;
    protected double Speed_in_MH;

    public Computer_lab08_Q2(){

    }

    public Computer_lab08_Q2(int WordSize_in_bit, int MemorySize_in_MB, int StorageSize_in_MB, double Speed_in_MH){
        this.WordSize_in_bit = WordSize_in_bit;
        this.MemorySize_in_MB = MemorySize_in_MB;
        this.StorageSize_in_MB = StorageSize_in_MB;
        this.Speed_in_MH = Speed_in_MH;
    }

    public void display(){
        System.out.println("Computer; "+"\nWord Size(Bits)= "+WordSize_in_bit+"\nMemory Size(MB)= "+MemorySize_in_MB+
                "\nStorage Size(MB)= "+StorageSize_in_MB+ "\nSpeed(MH)= "+Speed_in_MH);
    }


}
