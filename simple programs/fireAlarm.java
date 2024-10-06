public class fireAlarm
{
   public static boolean sprinkler(boolean t, boolean c, boolean v)
   {
       if ((t && c) || (!v && c))
       {
           return true;
       }
       else
       {
           return false;
       }
   }
}
