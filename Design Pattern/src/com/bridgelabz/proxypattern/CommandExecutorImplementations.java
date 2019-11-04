package com.bridgelabz.proxypattern;

import java.io.IOException;

public class CommandExecutorImplementations implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException {
                //some heavy implementation
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
	}

}