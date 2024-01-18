#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.dao.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class NtoccCar implements Cloneable, Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtModified;

    /**
     * 车辆ID
     */
    private String carId;

    /**
     * 顶级机构
     */
    private String orgroot;

    /**
     * 机构编码
     */
    private String orgcode;

    /**
     * 车牌号
     */
    private String licenseNumber;

    /**
     * 车型
     */
    private String carModel;

    /**
     * 车长
     */
    private String vehicleLength;

    /**
     * 车辆载重
     */
    private BigDecimal carLoad;

    /**
     * 道路运输证号
     */
    private String roadTransportCertificate;

    /**
     * 道路运输证有效期
     */
    private Date roadTransportCertificateExpire;

    /**
     * 车牌颜色
     */
    private String licensePlateColor;

    /**
     * 车辆所有者
     */
    private String carOwner;

    /**
     * 校验状态 0/处理中 1/处理失败 2/校验通过
     */
    private Byte checkStatus;

    /**
     * 行驶证有效期
     */
    private Date driverLicenseExpire;

    /**
     * 是否入网 null/无数据 0/未入网 1入网
     */
    private Byte inNet;

    /**
     * 交通部校验状态 0/处理中 1/处理失败 2/校验通过
     */
    private Byte motStatus;

    /**
     * 车辆备案状态：0/没有备案，1/备案成功
     */
    private Byte motEtcRecord;

    /**
     * ntocc_car
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取
     * @return id 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取创建时间
     * @return gmt_create 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取更新时间
     * @return gmt_modified 更新时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置更新时间
     * @param gmtModified 更新时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取车辆ID
     * @return car_id 车辆ID
     */
    public String getCarId() {
        return carId;
    }

    /**
     * 设置车辆ID
     * @param carId 车辆ID
     */
    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    /**
     * 获取顶级机构
     * @return orgroot 顶级机构
     */
    public String getOrgroot() {
        return orgroot;
    }

    /**
     * 设置顶级机构
     * @param orgroot 顶级机构
     */
    public void setOrgroot(String orgroot) {
        this.orgroot = orgroot == null ? null : orgroot.trim();
    }

    /**
     * 获取机构编码
     * @return orgcode 机构编码
     */
    public String getOrgcode() {
        return orgcode;
    }

    /**
     * 设置机构编码
     * @param orgcode 机构编码
     */
    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    /**
     * 获取车牌号
     * @return license_number 车牌号
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 设置车牌号
     * @param licenseNumber 车牌号
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber == null ? null : licenseNumber.trim();
    }

    /**
     * 获取车型
     * @return car_model 车型
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * 设置车型
     * @param carModel 车型
     */
    public void setCarModel(String carModel) {
        this.carModel = carModel == null ? null : carModel.trim();
    }

    /**
     * 获取车长
     * @return vehicle_length 车长
     */
    public String getVehicleLength() {
        return vehicleLength;
    }

    /**
     * 设置车长
     * @param vehicleLength 车长
     */
    public void setVehicleLength(String vehicleLength) {
        this.vehicleLength = vehicleLength == null ? null : vehicleLength.trim();
    }

    /**
     * 获取车辆载重
     * @return car_load 车辆载重
     */
    public BigDecimal getCarLoad() {
        return carLoad;
    }

    /**
     * 设置车辆载重
     * @param carLoad 车辆载重
     */
    public void setCarLoad(BigDecimal carLoad) {
        this.carLoad = carLoad;
    }

    /**
     * 获取道路运输证号
     * @return road_transport_certificate 道路运输证号
     */
    public String getRoadTransportCertificate() {
        return roadTransportCertificate;
    }

    /**
     * 设置道路运输证号
     * @param roadTransportCertificate 道路运输证号
     */
    public void setRoadTransportCertificate(String roadTransportCertificate) {
        this.roadTransportCertificate = roadTransportCertificate == null ? null : roadTransportCertificate.trim();
    }

    /**
     * 获取道路运输证有效期
     * @return road_transport_certificate_expire 道路运输证有效期
     */
    public Date getRoadTransportCertificateExpire() {
        return roadTransportCertificateExpire;
    }

    /**
     * 设置道路运输证有效期
     * @param roadTransportCertificateExpire 道路运输证有效期
     */
    public void setRoadTransportCertificateExpire(Date roadTransportCertificateExpire) {
        this.roadTransportCertificateExpire = roadTransportCertificateExpire;
    }

    /**
     * 获取车牌颜色
     * @return license_plate_color 车牌颜色
     */
    public String getLicensePlateColor() {
        return licensePlateColor;
    }

    /**
     * 设置车牌颜色
     * @param licensePlateColor 车牌颜色
     */
    public void setLicensePlateColor(String licensePlateColor) {
        this.licensePlateColor = licensePlateColor == null ? null : licensePlateColor.trim();
    }

    /**
     * 获取车辆所有者
     * @return car_owner 车辆所有者
     */
    public String getCarOwner() {
        return carOwner;
    }

    /**
     * 设置车辆所有者
     * @param carOwner 车辆所有者
     */
    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner == null ? null : carOwner.trim();
    }

    /**
     * 获取校验状态 0/处理中 1/处理失败 2/校验通过
     * @return check_status 校验状态 0/处理中 1/处理失败 2/校验通过
     */
    public Byte getCheckStatus() {
        return checkStatus;
    }

    /**
     * 设置校验状态 0/处理中 1/处理失败 2/校验通过
     * @param checkStatus 校验状态 0/处理中 1/处理失败 2/校验通过
     */
    public void setCheckStatus(Byte checkStatus) {
        this.checkStatus = checkStatus;
    }

    /**
     * 获取行驶证有效期
     * @return driver_license_expire 行驶证有效期
     */
    public Date getDriverLicenseExpire() {
        return driverLicenseExpire;
    }

    /**
     * 设置行驶证有效期
     * @param driverLicenseExpire 行驶证有效期
     */
    public void setDriverLicenseExpire(Date driverLicenseExpire) {
        this.driverLicenseExpire = driverLicenseExpire;
    }

    /**
     * 获取是否入网 null/无数据 0/未入网 1入网
     * @return in_net 是否入网 null/无数据 0/未入网 1入网
     */
    public Byte getInNet() {
        return inNet;
    }

    /**
     * 设置是否入网 null/无数据 0/未入网 1入网
     * @param inNet 是否入网 null/无数据 0/未入网 1入网
     */
    public void setInNet(Byte inNet) {
        this.inNet = inNet;
    }

    /**
     * 获取交通部校验状态 0/处理中 1/处理失败 2/校验通过
     * @return mot_status 交通部校验状态 0/处理中 1/处理失败 2/校验通过
     */
    public Byte getMotStatus() {
        return motStatus;
    }

    /**
     * 设置交通部校验状态 0/处理中 1/处理失败 2/校验通过
     * @param motStatus 交通部校验状态 0/处理中 1/处理失败 2/校验通过
     */
    public void setMotStatus(Byte motStatus) {
        this.motStatus = motStatus;
    }

    /**
     * 获取车辆备案状态：0/没有备案，1/备案成功
     * @return mot_etc_record 车辆备案状态：0/没有备案，1/备案成功
     */
    public Byte getMotEtcRecord() {
        return motEtcRecord;
    }

    /**
     * 设置车辆备案状态：0/没有备案，1/备案成功
     * @param motEtcRecord 车辆备案状态：0/没有备案，1/备案成功
     */
    public void setMotEtcRecord(Byte motEtcRecord) {
        this.motEtcRecord = motEtcRecord;
    }

    @Override
    public NtoccCar clone() throws CloneNotSupportedException {
        return (NtoccCar) super.clone();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", carId=").append(carId);
        sb.append(", orgroot=").append(orgroot);
        sb.append(", orgcode=").append(orgcode);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", carModel=").append(carModel);
        sb.append(", vehicleLength=").append(vehicleLength);
        sb.append(", carLoad=").append(carLoad);
        sb.append(", roadTransportCertificate=").append(roadTransportCertificate);
        sb.append(", roadTransportCertificateExpire=").append(roadTransportCertificateExpire);
        sb.append(", licensePlateColor=").append(licensePlateColor);
        sb.append(", carOwner=").append(carOwner);
        sb.append(", checkStatus=").append(checkStatus);
        sb.append(", driverLicenseExpire=").append(driverLicenseExpire);
        sb.append(", inNet=").append(inNet);
        sb.append(", motStatus=").append(motStatus);
        sb.append(", motEtcRecord=").append(motEtcRecord);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    public static NtoccCar.Builder builder() {
        return new NtoccCar.Builder();
    }

    /**
     * ntocc_car null
     */
    public static class Builder {
        /**
         * ntocc_car
         */
        private NtoccCar obj;

        public Builder() {
            this.obj = new NtoccCar();
        }

        /**
         * 设置
         * @param id 
         */
        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        /**
         * 设置创建时间
         * @param gmtCreate 创建时间
         */
        public Builder gmtCreate(Date gmtCreate) {
            obj.setGmtCreate(gmtCreate);
            return this;
        }

        /**
         * 设置更新时间
         * @param gmtModified 更新时间
         */
        public Builder gmtModified(Date gmtModified) {
            obj.setGmtModified(gmtModified);
            return this;
        }

        /**
         * 设置车辆ID
         * @param carId 车辆ID
         */
        public Builder carId(String carId) {
            obj.setCarId(carId);
            return this;
        }

        /**
         * 设置顶级机构
         * @param orgroot 顶级机构
         */
        public Builder orgroot(String orgroot) {
            obj.setOrgroot(orgroot);
            return this;
        }

        /**
         * 设置机构编码
         * @param orgcode 机构编码
         */
        public Builder orgcode(String orgcode) {
            obj.setOrgcode(orgcode);
            return this;
        }

        /**
         * 设置车牌号
         * @param licenseNumber 车牌号
         */
        public Builder licenseNumber(String licenseNumber) {
            obj.setLicenseNumber(licenseNumber);
            return this;
        }

        /**
         * 设置车型
         * @param carModel 车型
         */
        public Builder carModel(String carModel) {
            obj.setCarModel(carModel);
            return this;
        }

        /**
         * 设置车长
         * @param vehicleLength 车长
         */
        public Builder vehicleLength(String vehicleLength) {
            obj.setVehicleLength(vehicleLength);
            return this;
        }

        /**
         * 设置车辆载重
         * @param carLoad 车辆载重
         */
        public Builder carLoad(BigDecimal carLoad) {
            obj.setCarLoad(carLoad);
            return this;
        }

        /**
         * 设置道路运输证号
         * @param roadTransportCertificate 道路运输证号
         */
        public Builder roadTransportCertificate(String roadTransportCertificate) {
            obj.setRoadTransportCertificate(roadTransportCertificate);
            return this;
        }

        /**
         * 设置道路运输证有效期
         * @param roadTransportCertificateExpire 道路运输证有效期
         */
        public Builder roadTransportCertificateExpire(Date roadTransportCertificateExpire) {
            obj.setRoadTransportCertificateExpire(roadTransportCertificateExpire);
            return this;
        }

        /**
         * 设置车牌颜色
         * @param licensePlateColor 车牌颜色
         */
        public Builder licensePlateColor(String licensePlateColor) {
            obj.setLicensePlateColor(licensePlateColor);
            return this;
        }

        /**
         * 设置车辆所有者
         * @param carOwner 车辆所有者
         */
        public Builder carOwner(String carOwner) {
            obj.setCarOwner(carOwner);
            return this;
        }

        /**
         * 设置校验状态 0/处理中 1/处理失败 2/校验通过
         * @param checkStatus 校验状态 0/处理中 1/处理失败 2/校验通过
         */
        public Builder checkStatus(Byte checkStatus) {
            obj.setCheckStatus(checkStatus);
            return this;
        }

        /**
         * 设置行驶证有效期
         * @param driverLicenseExpire 行驶证有效期
         */
        public Builder driverLicenseExpire(Date driverLicenseExpire) {
            obj.setDriverLicenseExpire(driverLicenseExpire);
            return this;
        }

        /**
         * 设置是否入网 null/无数据 0/未入网 1入网
         * @param inNet 是否入网 null/无数据 0/未入网 1入网
         */
        public Builder inNet(Byte inNet) {
            obj.setInNet(inNet);
            return this;
        }

        /**
         * 设置交通部校验状态 0/处理中 1/处理失败 2/校验通过
         * @param motStatus 交通部校验状态 0/处理中 1/处理失败 2/校验通过
         */
        public Builder motStatus(Byte motStatus) {
            obj.setMotStatus(motStatus);
            return this;
        }

        /**
         * 设置车辆备案状态：0/没有备案，1/备案成功
         * @param motEtcRecord 车辆备案状态：0/没有备案，1/备案成功
         */
        public Builder motEtcRecord(Byte motEtcRecord) {
            obj.setMotEtcRecord(motEtcRecord);
            return this;
        }

        public NtoccCar build() {
            return this.obj;
        }
    }

    /**
     * ntocc_car
     */
    public enum Column {
        id("id", "id", "BIGINT", false),
        gmtCreate("gmt_create", "gmtCreate", "TIMESTAMP", false),
        gmtModified("gmt_modified", "gmtModified", "TIMESTAMP", false),
        carId("car_id", "carId", "VARCHAR", false),
        orgroot("orgroot", "orgroot", "CHAR", false),
        orgcode("orgcode", "orgcode", "VARCHAR", false),
        licenseNumber("license_number", "licenseNumber", "VARCHAR", false),
        carModel("car_model", "carModel", "VARCHAR", false),
        vehicleLength("vehicle_length", "vehicleLength", "VARCHAR", false),
        carLoad("car_load", "carLoad", "DECIMAL", false),
        roadTransportCertificate("road_transport_certificate", "roadTransportCertificate", "VARCHAR", false),
        roadTransportCertificateExpire("road_transport_certificate_expire", "roadTransportCertificateExpire", "DATE", false),
        licensePlateColor("license_plate_color", "licensePlateColor", "VARCHAR", false),
        carOwner("car_owner", "carOwner", "VARCHAR", false),
        checkStatus("check_status", "checkStatus", "TINYINT", false),
        driverLicenseExpire("driver_license_expire", "driverLicenseExpire", "DATE", false),
        inNet("in_net", "inNet", "TINYINT", false),
        motStatus("mot_status", "motStatus", "TINYINT", false),
        motEtcRecord("mot_etc_record", "motEtcRecord", "TINYINT", false);

        /**
         * ntocc_car
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * ntocc_car
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * ntocc_car
         */
        private final String column;

        /**
         * ntocc_car
         */
        private final boolean isColumnNameDelimited;

        /**
         * ntocc_car
         */
        private final String javaProperty;

        /**
         * ntocc_car
         */
        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}