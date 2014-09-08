package lan.s40907.protopubStorm;

import java.util.Map;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.IRichBolt;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.tuple.Tuple;

public class PrintBolt implements IRichBolt {
	private OutputCollector collector;

	@Override
	public void cleanup() {}

	@Override
	public void execute(Tuple tuple) {
		String string = tuple.getString(0);
		System.out.print("FOUND: " + string);
		this.collector.ack(tuple);
	}

	@Override
	public void prepare(Map conf, TopologyContext context, OutputCollector collector) {
		this.collector = collector;		
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer arg0) {}

	@Override
	public Map<String, Object> getComponentConfiguration() {
		return null;
	}

}
