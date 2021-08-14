package www.dream.com.delivery.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import www.dream.com.framework.printer.ClassPrintTarget;
import www.dream.com.framework.printer.PrintTarget;

@Data
@NoArgsConstructor
@ClassPrintTarget
public class DeliveryRequestVO extends DeliveryVO {

	public static final String DESCRIM4REQUEST = "request";
	@PrintTarget(order = 200, caption = "주문자")
	private String memberId;
	@PrintTarget(order = 300, caption = "출발지")
	private String storeId;
	@PrintTarget(order = 400, caption = "상세주문")
	private String orderContents;
	private double endLat;
	private double endLng;
	@PrintTarget(order = 500, caption = "도착지")
	private String endAddr;
	@PrintTarget(order = 600, caption = "배달비")
	private String deliveryTip;
	@PrintTarget(order = 700, caption = "조리시간")
	private String cookedTime;

	public DeliveryRequestVO(String memberId, String storeId, String orderContents, double endLat, double endLng,
			String endAddr, String deliveryTip, String cookedTime) {
		this.memberId = memberId;
		this.storeId = storeId;
		this.orderContents = orderContents;
		this.endLat = endLat;
		this.endLng = endLng;
		this.endAddr = endAddr;
		this.deliveryTip = deliveryTip;
		this.cookedTime = cookedTime;
	}

	@Override
	public String toString() {
		return "DeliveryRequestVO [memberId=" + memberId + ", storeId=" + storeId + ", orderContents=" + orderContents
				+ ", endLat=" + endLat + ", endLng=" + endLng + ", endAddr=" + endAddr + ", deliveryTip=" + deliveryTip
				+ ", cookedTime=" + cookedTime + ", getId()=" + getId() + ", getStatus()=" + getStatus() + "]";
	}

}
