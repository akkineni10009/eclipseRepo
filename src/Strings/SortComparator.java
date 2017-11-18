package Strings;

import java.util.Comparator;

public class SortComparator implements Comparator<Integer>
{
  @Override
  public int compare(Integer value1,Integer value2)
  {
    return value2.compareTo(value1);
  }
}