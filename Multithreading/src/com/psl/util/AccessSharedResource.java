package com.psl.util;

public class AccessSharedResource extends Thread {
	private SharedResource sharedResource;
	
	
	
	public AccessSharedResource(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}



	@Override
	public void run() {
		synchronized (sharedResource) { // Synchronized flow....an alternative to synchronized method.

			System.out.println(sharedResource.readCurrentValue());
		}
	}

}
