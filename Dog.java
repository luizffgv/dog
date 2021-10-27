import static java.lang.Math.random;
import static java.lang.System.out;

public class Dog
{
    private static final String msgHappy = "*happy woof noises*";
    private static final String msgSad   = "*sad woof noises*";
    private static final String msgReturn
      = "holy hell, that was too fast! imma throw that shit back";
    private static final String msgBackwards
      = "ayo wtf, man's throwin' backwards";

    public Dog() { out.println("woof"); }

    public void play(Runnable thrower)
    {
        try
        {
            thrower.run();
        }
        catch (Ball ball)
        {
            if (ball.force < 0)
            {
                out.println(msgBackwards);
                return;
            }

            if (ball.force > 50)
            {
                out.println(msgReturn);
                throw ball;
            }

            if (random() < 0.5 / ball.force)
                out.println(msgHappy);
            else
                out.println(msgSad);
        }
    }
}