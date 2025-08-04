public class Main {
    private final static scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();


    public static void main(String[] args) {

        var option = -1;
        do {
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a máquina com água");
            System.out.println("3 - Abastecer a máquina com shampoo);
            System.out.println("4 - Verificar água da máquina");
            System.out.println("5 - Verificar se tem shampoo na máquina");
            System.out.println("6 - Verificar se tem pet na máquina);
            System.out.println("7 - Colocar o pet na máquina");
            System.out.println("8 - Retirar o pet da máquina");
            System.out.println("9 - Limpar a máquina");
            System.out.println("0 Sair");
            option = scanner.nextInt();
            switch (option){
            }
                case 6 -> petMachine.hasPet();
                case 7 -> setPetInPetMachine();
                case 8 ->petMachine.removePet();
                case 9 -> petMachine.wash();
            }
        }while (option !=0);
    }
    public static void setPetInPetMachine(){
        var name = "";
        while (name == null || name.isEmpty()){
        System.out.println ("Informe o nome do pet");
        var name = scanner.next();

        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet" + pet.getName() + "Foi colocado na máquina");
}