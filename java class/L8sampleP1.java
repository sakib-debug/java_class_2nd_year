//車クラス
class CarP1{
    int num;
    double gas;
    void setNumGas(int n, double g)
    {
        num = n; 
        gas = g;
        System.out.println("車のナンバーを"+ num + "に　ガソリン量を" + gas + "にしました。");

    }
    void show()
    {
        System.out.println("車のナンバーは"+ num +"です。");
        System.out.println("ガソリン量 は" + gas +"です。");

    }
}
 class L8sampleP1 {
    public static void main(String[] args) {
        CarP1 car1 = new CarP1();
        car1.setNumGas(1234, 20.5);
        car1.show();
    

        
    }
    
}
