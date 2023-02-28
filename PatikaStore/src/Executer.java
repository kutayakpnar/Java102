import java.util.*;

public class Executer {
    TreeSet<Brand> brandSet=new TreeSet<>(new Comparator<Brand>() {
        @Override
        public int compare(Brand o1, Brand o2) {
            return o1.getName().compareTo(o2.getName());
        }
    });
    List<Phone> phones=new ArrayList<>();
    List<Devices> devices=new ArrayList<>();
    public void run(){

        brandSet.add(new Brand(1,"Samsung"));
        brandSet.add(new Brand(2,"Lenovo"));
        brandSet.add(new Brand(3,"Apple"));
        brandSet.add(new Brand(4,"Huawei"));
        brandSet.add(new Brand(5,"Casper"));
        brandSet.add(new Brand(6,"Asus"));
        brandSet.add(new Brand(7,"Hp"));
        brandSet.add(new Brand(8,"Xiaomi"));
        brandSet.add(new Brand(9,"Monster"));
        operations();
    }


    public void printBrand(Set<Brand> set){
        System.out.println("OUR BRANDS:");
        System.out.println("------------------");
        for(Brand br:set){
            System.out.println("-"+br.getName());
        }
    }
    public void operations(){
        System.out.println("1-Notebook Operations:");
        System.out.println("2-Phone Operations");
        System.out.println("3-Show Brands");
        System.out.println("0-Exit");
        Scanner scan=new Scanner(System.in);

    while(true){
        System.out.println("Enter operation:");
        int op= scan.nextInt();
        if(op==0){
            System.out.println("See you!");
            break;
        }
        if(op==3){
            printBrand(this.brandSet);
        }
        if(op==1){
            showNotebooks();
        }
        if (op==2){
            showPhones();
        }

    }
    }
    public void showPhones(){
        if(devices.size()==0){
            System.out.println("There is no phone in the system.");
        }
        else {
            for(Devices i:devices){
                if(i instanceof Phone){
                    System.out.println(i.getId()+" "+i.getName()+" "+i.getBrand()+" "+i.getPrice()+" ");

                }
            }
        }
    }
    public Set<Phone>  filterbyId(List<Phone> phones){
        TreeSet<Phone> phones1 =new TreeSet<>(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getId()-o2.getId();
            }
        });
        for(Phone i:phones1){
            System.out.println(i.getId()+" "+i.getName()+" "+i.getBrand()+" "+i.getPrice());
        }
        return phones1;

    }
    public void showNotebooks(){
        if(devices.size()==0){
            System.out.println("There is no phone in the system.");
        }
        else {
            for(Devices i:devices){
                if(i instanceof Notebook){
                    System.out.println(i.getId()+" "+i.getName()+" "+i.getBrand()+" "+i.getPrice()+" ");

                }
            }
        }
    }




}
