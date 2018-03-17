package br.pucrio.opus.organic.smells.ranking;

import java.util.Arrays;
import java.util.List;

import br.pucrio.opus.organic.metrics.MetricName;

public class LongMethodComparator extends OrderedMetricValuesComparator {

	@Override
	protected List<MetricName> getMetricOrdering() {
		return Arrays.asList(MetricName.MLOC);
	}
	
}
