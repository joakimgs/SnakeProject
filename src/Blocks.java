    /**
     * @author Joaki
     */
    public class Blocks {
    private boolean booleanIn;
    private boolean booleanInFlag;

    public Blocks(){
        booleanIn = false;
        booleanInFlag = true;
    }

    /**
     *  Set booleanIn
     */
    public void setBooleanIn(){
        booleanIn = true;
    }

    /**
     * @return booleanIn
     */
    public boolean getBooleanIn(){
        return booleanIn;
    }

    /**
     * @return booleanInFlag
     */
    public boolean getVisitable(){
        return booleanInFlag;
    }

    /**
     * Set value booleanInFlag from booleanIn
     * @param booleanIn
     */
    public void setBooleanInFlag(boolean booleanIn){
        booleanInFlag = booleanIn;
    }
}