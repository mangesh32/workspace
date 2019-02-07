package com.psl.util;

public class UpdateSharedResource extends Thread {
	private SharedResource sharedResource;
	
	
	
	
	public UpdateSharedResource(SharedResource sharedResource) {
		super();
		this.sharedResource = sharedResource;
	}




	@Override
	public void run() {
		synchronized (sharedResource) {
			//TODO ye method meko likhni hai.
			sharedResource.startCycle();
			Thread.yield();
		}
	}

}
