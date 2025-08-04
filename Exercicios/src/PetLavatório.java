public class PetLavatório {

    private boolean clean = true;

    private int water = 30;

    private int shampoo 10;

    private Pet pet;


    public void takeAshowerInAPet(){
        if (this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;

        }
        this.water -= 10;
        this.shampoo -= 2;
    pet.setClean(true);
        System.out.println("o pet" + pet.getName() + "Está limpinho");

    }
    public void addwater(){
        if (water == 30){
            System.out.println("A capacidade de agua da máquina está no limite");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("A capacidade de shampoo na máquina está no limite");
            return;
        }
        shampoo += 2;

}

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;

        public boolean hasPet(){
            return pet != null;
        }


    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A maquina esta suja, para colocar o pet é necesário limpa-la");
        return;

        }

        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + "Está na maquina nesse momento");
         return;
        }

    }
        this.pet = pet;
    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O Pet" + this.pet.getName() + "Foi retirado da máquina");
        this.pet = null;
    }

    public void wash(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println ("Máquina super limpa!!! |°| ")
    }
    }
