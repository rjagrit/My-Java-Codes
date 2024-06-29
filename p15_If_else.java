public class p15_If_else
{
    static void practice()
    {
        boolean isMale= true;
        String name="Gopi";
        System.out.println("Before if");
        if(isMale){
            System.out.println("Mr."+name);
        }
        else
        {
            System.out.println("Ms." + name);
        }
        System.out.println("after if");
    }
    public static void main(String[] args) {
        practice();
    }
}
