package com.xrtb.common;

/**
 * An object that encapsulates the 'creative' (the ad served up and it's attributes). The creative represents the physical object served up
 * by the bidder to the mobile device. The creative contains the image url, the pixel url, and the referring url. The creative will
 * them be used to create the components of the RTB 2 bid
 * @author Ben M. Faul
 *
 */
public class Creative {
	/** The forward URL used with this creative */
    public String forwardurl;
    /** The encoded version of the forward url used by this creative */
    private transient String encodedFurl;
    /* The image url used by this creative */
    public String imageurl;
    /** The encoded image URL used by this creative */
    private transient  String encodedIurl;
    /** The impression id of this creative */
    public String impid;
    /** The width of this creative */
    public double w;
    /** The height of this creative */
    public double h;
    
    /**
     * Empty constructor for creation using json.
     */
    public Creative() {
    	
    }
    
    /**
     * Does the HTTP encoding for the forward url and image url. The bid will use the encoded form.
     */
    void encodeUrl() {
    //	encodedFurl = URIEncoder.encodeURI(forwardUrl);
    //	encodedIurl = URIEncoder.encodeURI(imageUrl);
    	
    	encodedFurl = URIEncoder.myUri(forwardurl);
    	encodedIurl = URIEncoder.myUri(imageurl);
    }

    /**
     * Getter for the forward URL, unencoded.
     * @return String. The unencoded url.
     */
	public String getForwardUrl() {
		return forwardurl;
	}
	
	/**
	 * Return the encoded forward url
	 * @return String. The encoded url
	 */
	public String getEncodedForwardUrl() {
		if (encodedFurl == null)
				encodeUrl();
		return encodedFurl;
	}
	
	/**
	 * Return the encoded image url
	 * @return String. The returned encoded url
	 */
	public String getEncodedIUrl() {
		if (encodedIurl == null)
			encodeUrl();
		return encodedIurl;
	}

	/**
	 * Setter for the forward url, unencoded.
	 * @param forwardUrl String. The unencoded forwardurl.
	 */
	public void setForwardUrl(String forwardUrl) {
		this.forwardurl = forwardUrl;
	}

	/**
	 * Getter for the image url.
	 * @return String. Returns the imageUrl.
	 */
	public String getImageUrl() {
		return imageurl;
	}

	/**
	 * Setter for the imageurl
	 * @param imageUrl String. The image url to set.
	 */
	public void setImageUrl(String imageUrl) {
		this.imageurl = imageUrl;
	}

	/**
	 * Returns the impression id for this creative (the database key used in wins and bids).
	 * @return String. The impression id.
	 */
	public String getImpid() {
		return impid;
	}

	/**
	 * Set the impression id object.
	 * @param impid String. The impression id to use for this creative. This is merely a 
	 * databse key you can use to find bids and wins for this id.
	 */
	public void setImpid(String impid) {
		this.impid = impid;
	}

	/**
	 * Get the width of the creative, in pixels.
	 * @return int. The height in pixels of this creative.
	 */
	public double getW() {
		return w;
	}

	/**
	 * Set the width of the creative.
	 * @param w int. The width of the pixels to set the creative.
	 */
	public void setW(double w) {
		this.w = w;
	}

	/**
	 * Return the height in pixels of this creative
	 * @return int. The height in pixels.
	 */
	public double getH() {
		return h;
	}

	/**
	 * Set the height of this creative.
	 * @param h int. Height in pixels.
	 */
	public void setH(double h) {
		this.h = h;
	}

}
