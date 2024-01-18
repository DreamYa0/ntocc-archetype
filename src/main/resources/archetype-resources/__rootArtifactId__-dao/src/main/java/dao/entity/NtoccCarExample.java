#set($symbol_pound='#')
        #set($symbol_dollar='$')
        #set($symbol_escape='\' )
package ${package}.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NtoccCarExample {
    /**
     * ntocc_car
     */
    protected String orderByClause;

    /**
     * ntocc_car
     */
    protected boolean distinct;

    /**
     * ntocc_car
     */
    protected List<Criteria> oredCriteria;

    /**
     * ntocc_car
     */
    protected Integer offset;

    /**
     * ntocc_car
     */
    protected Integer rows;

    public NtoccCarExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public NtoccCarExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public NtoccCarExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        rows = null;
        offset = null;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return this.offset;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getRows() {
        return this.rows;
    }

    public NtoccCarExample limit(Integer rows) {
        this.rows = rows;
        return this;
    }

    public NtoccCarExample limit(Integer offset, Integer rows) {
        this.offset = offset;
        this.rows = rows;
        return this;
    }

    public NtoccCarExample page(Integer page, Integer pageSize) {
        this.offset = (page - 1) * pageSize;
        this.rows = pageSize;
        return this;
    }

    public static Criteria newAndCreateCriteria() {
        NtoccCarExample example = new NtoccCarExample();
        return example.createCriteria();
    }

    public NtoccCarExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public NtoccCarExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    /**
     * ntocc_car null
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_create = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_create <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_create > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_create >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_create < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_create <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_modified = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_modified <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_modified > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_modified >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_modified < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("gmt_modified <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andOrgrootIsNull() {
            addCriterion("orgroot is null");
            return (Criteria) this;
        }

        public Criteria andOrgrootIsNotNull() {
            addCriterion("orgroot is not null");
            return (Criteria) this;
        }

        public Criteria andOrgrootEqualTo(String value) {
            addCriterion("orgroot =", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgroot = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgrootNotEqualTo(String value) {
            addCriterion("orgroot <>", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgroot <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgrootGreaterThan(String value) {
            addCriterion("orgroot >", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgroot > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgrootGreaterThanOrEqualTo(String value) {
            addCriterion("orgroot >=", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgroot >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgrootLessThan(String value) {
            addCriterion("orgroot <", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgroot < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgrootLessThanOrEqualTo(String value) {
            addCriterion("orgroot <=", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgroot <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgrootLike(String value) {
            addCriterion("orgroot like", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootNotLike(String value) {
            addCriterion("orgroot not like", value, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootIn(List<String> values) {
            addCriterion("orgroot in", values, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootNotIn(List<String> values) {
            addCriterion("orgroot not in", values, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootBetween(String value1, String value2) {
            addCriterion("orgroot between", value1, value2, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgrootNotBetween(String value1, String value2) {
            addCriterion("orgroot not between", value1, value2, "orgroot");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNull() {
            addCriterion("orgcode is null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIsNotNull() {
            addCriterion("orgcode is not null");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualTo(String value) {
            addCriterion("orgcode =", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgcode = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualTo(String value) {
            addCriterion("orgcode <>", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgcode <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThan(String value) {
            addCriterion("orgcode >", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgcode > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualTo(String value) {
            addCriterion("orgcode >=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgcode >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThan(String value) {
            addCriterion("orgcode <", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgcode < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualTo(String value) {
            addCriterion("orgcode <=", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("orgcode <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andOrgcodeLike(String value) {
            addCriterion("orgcode like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotLike(String value) {
            addCriterion("orgcode not like", value, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeIn(List<String> values) {
            addCriterion("orgcode in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotIn(List<String> values) {
            addCriterion("orgcode not in", values, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeBetween(String value1, String value2) {
            addCriterion("orgcode between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andOrgcodeNotBetween(String value1, String value2) {
            addCriterion("orgcode not between", value1, value2, "orgcode");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_number = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_number <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_number > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_number >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_number < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_number <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNull() {
            addCriterion("car_model is null");
            return (Criteria) this;
        }

        public Criteria andCarModelIsNotNull() {
            addCriterion("car_model is not null");
            return (Criteria) this;
        }

        public Criteria andCarModelEqualTo(String value) {
            addCriterion("car_model =", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_model = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarModelNotEqualTo(String value) {
            addCriterion("car_model <>", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_model <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThan(String value) {
            addCriterion("car_model >", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_model > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanOrEqualTo(String value) {
            addCriterion("car_model >=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_model >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarModelLessThan(String value) {
            addCriterion("car_model <", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_model < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanOrEqualTo(String value) {
            addCriterion("car_model <=", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_model <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarModelLike(String value) {
            addCriterion("car_model like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotLike(String value) {
            addCriterion("car_model not like", value, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelIn(List<String> values) {
            addCriterion("car_model in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotIn(List<String> values) {
            addCriterion("car_model not in", values, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelBetween(String value1, String value2) {
            addCriterion("car_model between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andCarModelNotBetween(String value1, String value2) {
            addCriterion("car_model not between", value1, value2, "carModel");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthIsNull() {
            addCriterion("vehicle_length is null");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthIsNotNull() {
            addCriterion("vehicle_length is not null");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthEqualTo(String value) {
            addCriterion("vehicle_length =", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("vehicle_length = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotEqualTo(String value) {
            addCriterion("vehicle_length <>", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("vehicle_length <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVehicleLengthGreaterThan(String value) {
            addCriterion("vehicle_length >", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("vehicle_length > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVehicleLengthGreaterThanOrEqualTo(String value) {
            addCriterion("vehicle_length >=", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("vehicle_length >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVehicleLengthLessThan(String value) {
            addCriterion("vehicle_length <", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("vehicle_length < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVehicleLengthLessThanOrEqualTo(String value) {
            addCriterion("vehicle_length <=", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("vehicle_length <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andVehicleLengthLike(String value) {
            addCriterion("vehicle_length like", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotLike(String value) {
            addCriterion("vehicle_length not like", value, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthIn(List<String> values) {
            addCriterion("vehicle_length in", values, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotIn(List<String> values) {
            addCriterion("vehicle_length not in", values, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthBetween(String value1, String value2) {
            addCriterion("vehicle_length between", value1, value2, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andVehicleLengthNotBetween(String value1, String value2) {
            addCriterion("vehicle_length not between", value1, value2, "vehicleLength");
            return (Criteria) this;
        }

        public Criteria andCarLoadIsNull() {
            addCriterion("car_load is null");
            return (Criteria) this;
        }

        public Criteria andCarLoadIsNotNull() {
            addCriterion("car_load is not null");
            return (Criteria) this;
        }

        public Criteria andCarLoadEqualTo(BigDecimal value) {
            addCriterion("car_load =", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_load = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarLoadNotEqualTo(BigDecimal value) {
            addCriterion("car_load <>", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_load <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThan(BigDecimal value) {
            addCriterion("car_load >", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_load > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("car_load >=", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_load >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThan(BigDecimal value) {
            addCriterion("car_load <", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_load < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("car_load <=", value, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_load <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarLoadIn(List<BigDecimal> values) {
            addCriterion("car_load in", values, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotIn(List<BigDecimal> values) {
            addCriterion("car_load not in", values, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("car_load between", value1, value2, "carLoad");
            return (Criteria) this;
        }

        public Criteria andCarLoadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("car_load not between", value1, value2, "carLoad");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateIsNull() {
            addCriterion("road_transport_certificate is null");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateIsNotNull() {
            addCriterion("road_transport_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateEqualTo(String value) {
            addCriterion("road_transport_certificate =", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateNotEqualTo(String value) {
            addCriterion("road_transport_certificate <>", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateGreaterThan(String value) {
            addCriterion("road_transport_certificate >", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("road_transport_certificate >=", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateLessThan(String value) {
            addCriterion("road_transport_certificate <", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateLessThanOrEqualTo(String value) {
            addCriterion("road_transport_certificate <=", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateLike(String value) {
            addCriterion("road_transport_certificate like", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateNotLike(String value) {
            addCriterion("road_transport_certificate not like", value, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateIn(List<String> values) {
            addCriterion("road_transport_certificate in", values, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateNotIn(List<String> values) {
            addCriterion("road_transport_certificate not in", values, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateBetween(String value1, String value2) {
            addCriterion("road_transport_certificate between", value1, value2, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateNotBetween(String value1, String value2) {
            addCriterion("road_transport_certificate not between", value1, value2, "roadTransportCertificate");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireIsNull() {
            addCriterion("road_transport_certificate_expire is null");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireIsNotNull() {
            addCriterion("road_transport_certificate_expire is not null");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireEqualTo(Date value) {
            addCriterionForJDBCDate("road_transport_certificate_expire =", value, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate_expire = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireNotEqualTo(Date value) {
            addCriterionForJDBCDate("road_transport_certificate_expire <>", value, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate_expire <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireGreaterThan(Date value) {
            addCriterionForJDBCDate("road_transport_certificate_expire >", value, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate_expire > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("road_transport_certificate_expire >=", value, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate_expire >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireLessThan(Date value) {
            addCriterionForJDBCDate("road_transport_certificate_expire <", value, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate_expire < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("road_transport_certificate_expire <=", value, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("road_transport_certificate_expire <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireIn(List<Date> values) {
            addCriterionForJDBCDate("road_transport_certificate_expire in", values, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireNotIn(List<Date> values) {
            addCriterionForJDBCDate("road_transport_certificate_expire not in", values, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("road_transport_certificate_expire between", value1, value2, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andRoadTransportCertificateExpireNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("road_transport_certificate_expire not between", value1, value2, "roadTransportCertificateExpire");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorIsNull() {
            addCriterion("license_plate_color is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorIsNotNull() {
            addCriterion("license_plate_color is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorEqualTo(String value) {
            addCriterion("license_plate_color =", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_plate_color = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorNotEqualTo(String value) {
            addCriterion("license_plate_color <>", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_plate_color <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorGreaterThan(String value) {
            addCriterion("license_plate_color >", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_plate_color > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate_color >=", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_plate_color >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorLessThan(String value) {
            addCriterion("license_plate_color <", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_plate_color < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorLessThanOrEqualTo(String value) {
            addCriterion("license_plate_color <=", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("license_plate_color <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorLike(String value) {
            addCriterion("license_plate_color like", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorNotLike(String value) {
            addCriterion("license_plate_color not like", value, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorIn(List<String> values) {
            addCriterion("license_plate_color in", values, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorNotIn(List<String> values) {
            addCriterion("license_plate_color not in", values, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorBetween(String value1, String value2) {
            addCriterion("license_plate_color between", value1, value2, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andLicensePlateColorNotBetween(String value1, String value2) {
            addCriterion("license_plate_color not between", value1, value2, "licensePlateColor");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIsNull() {
            addCriterion("car_owner is null");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIsNotNull() {
            addCriterion("car_owner is not null");
            return (Criteria) this;
        }

        public Criteria andCarOwnerEqualTo(String value) {
            addCriterion("car_owner =", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_owner = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotEqualTo(String value) {
            addCriterion("car_owner <>", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_owner <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThan(String value) {
            addCriterion("car_owner >", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_owner > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("car_owner >=", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_owner >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThan(String value) {
            addCriterion("car_owner <", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_owner < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThanOrEqualTo(String value) {
            addCriterion("car_owner <=", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("car_owner <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCarOwnerLike(String value) {
            addCriterion("car_owner like", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotLike(String value) {
            addCriterion("car_owner not like", value, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerIn(List<String> values) {
            addCriterion("car_owner in", values, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotIn(List<String> values) {
            addCriterion("car_owner not in", values, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerBetween(String value1, String value2) {
            addCriterion("car_owner between", value1, value2, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCarOwnerNotBetween(String value1, String value2) {
            addCriterion("car_owner not between", value1, value2, "carOwner");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("check_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("check_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Byte value) {
            addCriterion("check_status =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("check_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Byte value) {
            addCriterion("check_status <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("check_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Byte value) {
            addCriterion("check_status >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("check_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("check_status >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("check_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Byte value) {
            addCriterion("check_status <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("check_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Byte value) {
            addCriterion("check_status <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("check_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Byte> values) {
            addCriterion("check_status in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Byte> values) {
            addCriterion("check_status not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Byte value1, Byte value2) {
            addCriterion("check_status between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("check_status not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireIsNull() {
            addCriterion("driver_license_expire is null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireIsNotNull() {
            addCriterion("driver_license_expire is not null");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireEqualTo(Date value) {
            addCriterionForJDBCDate("driver_license_expire =", value, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("driver_license_expire = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireNotEqualTo(Date value) {
            addCriterionForJDBCDate("driver_license_expire <>", value, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("driver_license_expire <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireGreaterThan(Date value) {
            addCriterionForJDBCDate("driver_license_expire >", value, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("driver_license_expire > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driver_license_expire >=", value, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("driver_license_expire >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireLessThan(Date value) {
            addCriterionForJDBCDate("driver_license_expire <", value, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("driver_license_expire < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("driver_license_expire <=", value, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("driver_license_expire <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireIn(List<Date> values) {
            addCriterionForJDBCDate("driver_license_expire in", values, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireNotIn(List<Date> values) {
            addCriterionForJDBCDate("driver_license_expire not in", values, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driver_license_expire between", value1, value2, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andDriverLicenseExpireNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("driver_license_expire not between", value1, value2, "driverLicenseExpire");
            return (Criteria) this;
        }

        public Criteria andInNetIsNull() {
            addCriterion("in_net is null");
            return (Criteria) this;
        }

        public Criteria andInNetIsNotNull() {
            addCriterion("in_net is not null");
            return (Criteria) this;
        }

        public Criteria andInNetEqualTo(Byte value) {
            addCriterion("in_net =", value, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("in_net = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInNetNotEqualTo(Byte value) {
            addCriterion("in_net <>", value, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("in_net <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInNetGreaterThan(Byte value) {
            addCriterion("in_net >", value, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("in_net > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInNetGreaterThanOrEqualTo(Byte value) {
            addCriterion("in_net >=", value, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("in_net >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInNetLessThan(Byte value) {
            addCriterion("in_net <", value, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("in_net < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInNetLessThanOrEqualTo(Byte value) {
            addCriterion("in_net <=", value, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("in_net <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andInNetIn(List<Byte> values) {
            addCriterion("in_net in", values, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetNotIn(List<Byte> values) {
            addCriterion("in_net not in", values, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetBetween(Byte value1, Byte value2) {
            addCriterion("in_net between", value1, value2, "inNet");
            return (Criteria) this;
        }

        public Criteria andInNetNotBetween(Byte value1, Byte value2) {
            addCriterion("in_net not between", value1, value2, "inNet");
            return (Criteria) this;
        }

        public Criteria andMotStatusIsNull() {
            addCriterion("mot_status is null");
            return (Criteria) this;
        }

        public Criteria andMotStatusIsNotNull() {
            addCriterion("mot_status is not null");
            return (Criteria) this;
        }

        public Criteria andMotStatusEqualTo(Byte value) {
            addCriterion("mot_status =", value, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotStatusNotEqualTo(Byte value) {
            addCriterion("mot_status <>", value, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotStatusGreaterThan(Byte value) {
            addCriterion("mot_status >", value, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("mot_status >=", value, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotStatusLessThan(Byte value) {
            addCriterion("mot_status <", value, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotStatusLessThanOrEqualTo(Byte value) {
            addCriterion("mot_status <=", value, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotStatusIn(List<Byte> values) {
            addCriterion("mot_status in", values, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusNotIn(List<Byte> values) {
            addCriterion("mot_status not in", values, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusBetween(Byte value1, Byte value2) {
            addCriterion("mot_status between", value1, value2, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("mot_status not between", value1, value2, "motStatus");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordIsNull() {
            addCriterion("mot_etc_record is null");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordIsNotNull() {
            addCriterion("mot_etc_record is not null");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordEqualTo(Byte value) {
            addCriterion("mot_etc_record =", value, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_etc_record = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordNotEqualTo(Byte value) {
            addCriterion("mot_etc_record <>", value, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordNotEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_etc_record <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordGreaterThan(Byte value) {
            addCriterion("mot_etc_record >", value, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordGreaterThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_etc_record > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordGreaterThanOrEqualTo(Byte value) {
            addCriterion("mot_etc_record >=", value, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordGreaterThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_etc_record >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordLessThan(Byte value) {
            addCriterion("mot_etc_record <", value, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordLessThanColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_etc_record < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordLessThanOrEqualTo(Byte value) {
            addCriterion("mot_etc_record <=", value, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordLessThanOrEqualToColumn(NtoccCar.Column column) {
            addCriterion(new StringBuilder("mot_etc_record <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordIn(List<Byte> values) {
            addCriterion("mot_etc_record in", values, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordNotIn(List<Byte> values) {
            addCriterion("mot_etc_record not in", values, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordBetween(Byte value1, Byte value2) {
            addCriterion("mot_etc_record between", value1, value2, "motEtcRecord");
            return (Criteria) this;
        }

        public Criteria andMotEtcRecordNotBetween(Byte value1, Byte value2) {
            addCriterion("mot_etc_record not between", value1, value2, "motEtcRecord");
            return (Criteria) this;
        }
    }

    /**
     * ntocc_car
     */
    public static class Criteria extends GeneratedCriteria {
        /**
         * ntocc_car
         */
        private NtoccCarExample example;

        protected Criteria(NtoccCarExample example) {
            super();
            this.example = example;
        }

        public NtoccCarExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    /**
     * ntocc_car null
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(NtoccCarExample example);
    }
}