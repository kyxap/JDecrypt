//package chap05;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    int count = 0;
    
    public void setLocationCells(int[] locs)
    {
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell: locationCells)  
        {
        	if (guess < 0){
        		result = "Please enter positive ineger value!";
        		break;
        	}
        	else if (cell == -1) {
				result = "This cells already hited! Choose another one";
			}
        	else if (guess == cell) {
                result = "hit";
                numOfHits++;
                locationCells[count] = -1;
                break;
            }
            count++;
        }
        count = 0;
        if (numOfHits == locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
    
    public int getNumOfHits() {
		return numOfHits;
	}
}
