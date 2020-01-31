package cn.nomeatcoder.common;

import java.util.List;

public interface Mapper<Q extends Query,D extends Domain> {
	List<D> find(Q query);

	D get(Q query);

	long count(Q query);

	long insert(D tempDO);

	int update(D tempDO);
}
