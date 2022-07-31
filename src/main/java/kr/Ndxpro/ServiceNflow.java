package kr.Ndxpro;

public class ServiceNflow {

    String code;

    String label;

    String type;

    String detailLabel;

    int orderNuml;

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public String getDetailLabel() {
        return detailLabel;
    }

    public int getOrderNuml() {
        return orderNuml;
    }

    public ServiceNflow(String code, String label, String type, String detailLabel, int orderNuml) {
        this.code = code;
        this.label = label;
        this.type = type;
        this.detailLabel = detailLabel;
        this.orderNuml = orderNuml;
    }
}
