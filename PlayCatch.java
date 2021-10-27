import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class PlayCatch
{
    public static void main(String[] args)
    {
        var pupper = new Dog();

        var scan = new Scanner(in);

        while (true)
        {
            out.print("Throw force: ");
            var force = scan.nextDouble();

            pupper.play(() -> { throw new Ball(force); });
        }
    }
}
