package dsa2017.day5.swing;

import java.util.List;

public interface NeighborFunc<T> 
{
	List<T> invokeNeighborFunc(T ik);
}
