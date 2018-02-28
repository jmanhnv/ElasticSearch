package com.elastic.search.delete;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.transport.InetSocketTransportAddress;

import com.elastic.search.search.ServerConst;

public class Delete {

	public static void main(String[] args) {
		new Delete().run();
	}

	public void run() {
		Client client = null;
		TransportClient transportClient = null;
		try {
			transportClient = new TransportClient();
			client = transportClient
					.addTransportAddress(new InetSocketTransportAddress(ServerConst.HOST, ServerConst.PORT));
		} finally {
			transportClient.close();
			client.close();
		}
	}
}
