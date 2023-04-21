class main{
    public static void main(String[] args) {


        Carro carro1 = new Carro();
        carro1.setCor("Azul");
        carro1.setModelo("BMW serie 3");
        carro1.setCapacidadeTaque(59);
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTaque());
        System.out.println(carro1.getCor());
        System.out.println(carro1.totalValorTanque(6.39));



        Carro carro2 = new Carro();
        carro2.setCor("Azul");
        carro2.setModelo("Mercedes");
        carro2.setCapacidadeTaque(66);
        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTaque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}