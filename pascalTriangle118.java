import java.util.ArrayList;
import java.util.List;

class Solution {
  public List < Integer > generateRow(int row) {
    Integer ans = 1;
    List < Integer > temp = new ArrayList < > ();
    temp.add(1);
    for (int col = 1; col < row; col++) {
      ans = ans * (row - col);
      ans = ans / col;
      temp.add(ans);
    }
    return temp;
  }
  public List < List < Integer >> generate(int numRows) {
    List < List < Integer >> result = new ArrayList < > ();
    for (int i = 1; i <= numRows; i++) {
      result.add(generateRow(i));
    }
    return result;
  }
}