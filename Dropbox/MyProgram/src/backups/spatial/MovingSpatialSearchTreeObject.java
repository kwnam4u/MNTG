package spatial;

/**
 * Interface describing a moving object in a spatial search tree.
 * 
 * @version 1.00	01.03.2003	first version, split from SpatialFileSearchTreeObject
 * @author Thomas Brinkhoff
 */
public interface MovingSpatialSearchTreeObject extends SpatialSearchTreeObject {
	
	/**
	 * Returns the number of the layer.
	 * @return  the layer
	 */
	void setMBR (MBR newMBR);

}
