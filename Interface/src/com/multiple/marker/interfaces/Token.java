package com.multiple.marker.interfaces;

public interface Token {
   void getToken();
}

@FunctionalInterface
interface Auth extends Token{
	//void auth();
}
