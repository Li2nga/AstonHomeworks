public class MyClassImpl implements MyClass {
    private int myFieldOne;
    private int myFieldTwo;
    private int myFieldThree;

    @Override
    public int getMyFieldOne() {
        return myFieldOne;
    }

    @Override
    public void setMyFieldOne(int myFieldOne) {
        if (myFieldOne > 0) {
            this.myFieldOne = myFieldOne;
        } else System.out.println("myFieldOne must be >0");
    }

    @Override
    public int getMyFieldTwo() {
        return myFieldTwo;
    }

    @Override
    public void setMyFieldTwo(int myFieldTwo) {
        if (myFieldTwo < 0) {
            this.myFieldTwo = myFieldTwo;
        } else System.out.println("myFieldTwo must be <0");
    }

    @Override
    public int getMyFieldThree() {
        return myFieldThree;
    }

    @Override
    public void setMyFieldThree(int myFieldThree) {

        {
            if (myFieldThree > -100 && myFieldThree < 2000) {
                this.myFieldThree = myFieldThree;
            } else System.out.println("myFieldThree must be from -99 to 1999");
        }
    }
}


