package lan.s40907.protocon;

import java.util.Arrays;
import java.util.List;

import lan.s40907.websocketclient.IWebSocketConfiguration;

public class WebSocketConfigurationKafka implements IWebSocketConfiguration {
	private String IpAddress = "192.168.1.60";
	private String Port = "8081";
	private List<String> SubProtocols = Arrays.asList("echo-protocol");
	
	@Override
	public String getIpAddress() {
		return IpAddress;
	}
	
	@Override
	public String getPort() {
		return Port;
	}
	
	@Override
	public List<String> getSubProtocols() {
		return SubProtocols;
	}
}
