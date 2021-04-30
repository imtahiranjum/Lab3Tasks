package Question_2;

import java.util.StringTokenizer;

public class CustomStringTokenizer extends StringTokenizer {
    private int totalTokens;
    private int digitlessTokens;
    private String currentToken;

    public void setCurrentToken(String currentToken) {
        this.currentToken = currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public CustomStringTokenizer(String string) {
        super(string);

    }

    public void setDigitlessTokens(int digitlessTokens) {
        this.digitlessTokens = digitlessTokens;
    }

    public void setTotalTokens(int totalTokens) {
        this.totalTokens = totalTokens;
    }

    public int getDigitlessTokens() {
        return digitlessTokens;
    }

    public int getTotalTokens() {
        return totalTokens;
    }

    public int countTokens(){
        setTotalTokens(super.countTokens());
        setDigitlessTokens(totalTokens);
        for(int i = 0; i<getTotalTokens(); i++){
            setCurrentToken(super.nextToken());
            for(int j = 0; j<getCurrentToken().length(); j++){
                if(Character.isDigit(getCurrentToken().charAt(j))){
                    setDigitlessTokens(getDigitlessTokens() -1);
                    break;
                }
            }
        }

        return getDigitlessTokens();

    }
}