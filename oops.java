    public class oops
    {
        public static void main(String Aa[])
        {
            computer obj=new computer();
            obj.playMusic();
            int n=obj.domult4(4);
            System.out.println("Result obtained is "+n);

        }
    }
    class computer
    {
        public void playMusic()
        {
            System.out.println("Music playing...");
        }
        public int domult4(int av)
        {
            if(av==4)
            {
                System.out.println("Error 4 cant be given");
                return 0;
            }
            
            return (4*av);
        }
    }