package www.dream.com.order.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import www.dream.com.order.model.DetailOrder;
import www.dream.com.order.model.OrderList;

public interface OrderMapper {
	//LRCUD
	public List<OrderList> getList();

	public List<DetailOrder> getDetailOrderList();

	public int insertOrder(@Param("memberId") String memberId,
			@Param("orderList") OrderList orderList, @Param("detailOrder") DetailOrder detailOrder);
}
