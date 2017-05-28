/**
 * Created by scem14 on 2017-04-24.
 */
public class Food {

    private Snake snake = new Snake();
    private int foodX;
    private int foodY;


    private final int RANDOMPOSITION = 20;

    public void createFood() {



        int location = (int) (Math.random() * RANDOMPOSITION);
        foodX = ((location * Board.getDotSize()));

        location = (int) (Math.random() * RANDOMPOSITION);
        foodY = ((location * Board.getDotSize()));

        if ((foodX == snake.getSnakeX(0)) && (foodY == snake.getSnakeY(0))) {
            createFood();
        }
    }

    public int getFoodX() {

        return foodX;
    }

    public int getFoodY() {
        return foodY;
    }
}