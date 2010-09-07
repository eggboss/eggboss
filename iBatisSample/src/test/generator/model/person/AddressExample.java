package test.generator.model.person;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddressExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public AddressExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    protected AddressExample(AddressExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table Person.Address
     *
     * @ibatorgenerated Tue Sep 07 17:48:31 CST 2010
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andAddressidIsNull() {
            addCriterion("AddressID is null");
            return this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("AddressID is not null");
            return this;
        }

        public Criteria andAddressidEqualTo(Integer value) {
            addCriterion("AddressID =", value, "addressid");
            return this;
        }

        public Criteria andAddressidNotEqualTo(Integer value) {
            addCriterion("AddressID <>", value, "addressid");
            return this;
        }

        public Criteria andAddressidGreaterThan(Integer value) {
            addCriterion("AddressID >", value, "addressid");
            return this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AddressID >=", value, "addressid");
            return this;
        }

        public Criteria andAddressidLessThan(Integer value) {
            addCriterion("AddressID <", value, "addressid");
            return this;
        }

        public Criteria andAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("AddressID <=", value, "addressid");
            return this;
        }

        public Criteria andAddressidIn(List values) {
            addCriterion("AddressID in", values, "addressid");
            return this;
        }

        public Criteria andAddressidNotIn(List values) {
            addCriterion("AddressID not in", values, "addressid");
            return this;
        }

        public Criteria andAddressidBetween(Integer value1, Integer value2) {
            addCriterion("AddressID between", value1, value2, "addressid");
            return this;
        }

        public Criteria andAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("AddressID not between", value1, value2, "addressid");
            return this;
        }

        public Criteria andAddressline1IsNull() {
            addCriterion("AddressLine1 is null");
            return this;
        }

        public Criteria andAddressline1IsNotNull() {
            addCriterion("AddressLine1 is not null");
            return this;
        }

        public Criteria andAddressline1EqualTo(String value) {
            addCriterion("AddressLine1 =", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1NotEqualTo(String value) {
            addCriterion("AddressLine1 <>", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1GreaterThan(String value) {
            addCriterion("AddressLine1 >", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1GreaterThanOrEqualTo(String value) {
            addCriterion("AddressLine1 >=", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1LessThan(String value) {
            addCriterion("AddressLine1 <", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1LessThanOrEqualTo(String value) {
            addCriterion("AddressLine1 <=", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1Like(String value) {
            addCriterion("AddressLine1 like", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1NotLike(String value) {
            addCriterion("AddressLine1 not like", value, "addressline1");
            return this;
        }

        public Criteria andAddressline1In(List values) {
            addCriterion("AddressLine1 in", values, "addressline1");
            return this;
        }

        public Criteria andAddressline1NotIn(List values) {
            addCriterion("AddressLine1 not in", values, "addressline1");
            return this;
        }

        public Criteria andAddressline1Between(String value1, String value2) {
            addCriterion("AddressLine1 between", value1, value2, "addressline1");
            return this;
        }

        public Criteria andAddressline1NotBetween(String value1, String value2) {
            addCriterion("AddressLine1 not between", value1, value2, "addressline1");
            return this;
        }

        public Criteria andAddressline2IsNull() {
            addCriterion("AddressLine2 is null");
            return this;
        }

        public Criteria andAddressline2IsNotNull() {
            addCriterion("AddressLine2 is not null");
            return this;
        }

        public Criteria andAddressline2EqualTo(String value) {
            addCriterion("AddressLine2 =", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2NotEqualTo(String value) {
            addCriterion("AddressLine2 <>", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2GreaterThan(String value) {
            addCriterion("AddressLine2 >", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2GreaterThanOrEqualTo(String value) {
            addCriterion("AddressLine2 >=", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2LessThan(String value) {
            addCriterion("AddressLine2 <", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2LessThanOrEqualTo(String value) {
            addCriterion("AddressLine2 <=", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2Like(String value) {
            addCriterion("AddressLine2 like", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2NotLike(String value) {
            addCriterion("AddressLine2 not like", value, "addressline2");
            return this;
        }

        public Criteria andAddressline2In(List values) {
            addCriterion("AddressLine2 in", values, "addressline2");
            return this;
        }

        public Criteria andAddressline2NotIn(List values) {
            addCriterion("AddressLine2 not in", values, "addressline2");
            return this;
        }

        public Criteria andAddressline2Between(String value1, String value2) {
            addCriterion("AddressLine2 between", value1, value2, "addressline2");
            return this;
        }

        public Criteria andAddressline2NotBetween(String value1, String value2) {
            addCriterion("AddressLine2 not between", value1, value2, "addressline2");
            return this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return this;
        }

        public Criteria andCityIn(List values) {
            addCriterion("City in", values, "city");
            return this;
        }

        public Criteria andCityNotIn(List values) {
            addCriterion("City not in", values, "city");
            return this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return this;
        }

        public Criteria andStateprovinceidIsNull() {
            addCriterion("StateProvinceID is null");
            return this;
        }

        public Criteria andStateprovinceidIsNotNull() {
            addCriterion("StateProvinceID is not null");
            return this;
        }

        public Criteria andStateprovinceidEqualTo(Integer value) {
            addCriterion("StateProvinceID =", value, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidNotEqualTo(Integer value) {
            addCriterion("StateProvinceID <>", value, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidGreaterThan(Integer value) {
            addCriterion("StateProvinceID >", value, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("StateProvinceID >=", value, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidLessThan(Integer value) {
            addCriterion("StateProvinceID <", value, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidLessThanOrEqualTo(Integer value) {
            addCriterion("StateProvinceID <=", value, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidIn(List values) {
            addCriterion("StateProvinceID in", values, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidNotIn(List values) {
            addCriterion("StateProvinceID not in", values, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidBetween(Integer value1, Integer value2) {
            addCriterion("StateProvinceID between", value1, value2, "stateprovinceid");
            return this;
        }

        public Criteria andStateprovinceidNotBetween(Integer value1, Integer value2) {
            addCriterion("StateProvinceID not between", value1, value2, "stateprovinceid");
            return this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("PostalCode is null");
            return this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("PostalCode is not null");
            return this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("PostalCode =", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("PostalCode <>", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("PostalCode >", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PostalCode >=", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("PostalCode <", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("PostalCode <=", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("PostalCode like", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("PostalCode not like", value, "postalcode");
            return this;
        }

        public Criteria andPostalcodeIn(List values) {
            addCriterion("PostalCode in", values, "postalcode");
            return this;
        }

        public Criteria andPostalcodeNotIn(List values) {
            addCriterion("PostalCode not in", values, "postalcode");
            return this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("PostalCode between", value1, value2, "postalcode");
            return this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("PostalCode not between", value1, value2, "postalcode");
            return this;
        }

        public Criteria andRowguidIsNull() {
            addCriterion("rowguid is null");
            return this;
        }

        public Criteria andRowguidIsNotNull() {
            addCriterion("rowguid is not null");
            return this;
        }

        public Criteria andRowguidEqualTo(String value) {
            addCriterion("rowguid =", value, "rowguid");
            return this;
        }

        public Criteria andRowguidNotEqualTo(String value) {
            addCriterion("rowguid <>", value, "rowguid");
            return this;
        }

        public Criteria andRowguidGreaterThan(String value) {
            addCriterion("rowguid >", value, "rowguid");
            return this;
        }

        public Criteria andRowguidGreaterThanOrEqualTo(String value) {
            addCriterion("rowguid >=", value, "rowguid");
            return this;
        }

        public Criteria andRowguidLessThan(String value) {
            addCriterion("rowguid <", value, "rowguid");
            return this;
        }

        public Criteria andRowguidLessThanOrEqualTo(String value) {
            addCriterion("rowguid <=", value, "rowguid");
            return this;
        }

        public Criteria andRowguidLike(String value) {
            addCriterion("rowguid like", value, "rowguid");
            return this;
        }

        public Criteria andRowguidNotLike(String value) {
            addCriterion("rowguid not like", value, "rowguid");
            return this;
        }

        public Criteria andRowguidIn(List values) {
            addCriterion("rowguid in", values, "rowguid");
            return this;
        }

        public Criteria andRowguidNotIn(List values) {
            addCriterion("rowguid not in", values, "rowguid");
            return this;
        }

        public Criteria andRowguidBetween(String value1, String value2) {
            addCriterion("rowguid between", value1, value2, "rowguid");
            return this;
        }

        public Criteria andRowguidNotBetween(String value1, String value2) {
            addCriterion("rowguid not between", value1, value2, "rowguid");
            return this;
        }

        public Criteria andModifieddateIsNull() {
            addCriterion("ModifiedDate is null");
            return this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("ModifiedDate is not null");
            return this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("ModifiedDate =", value, "modifieddate");
            return this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("ModifiedDate <>", value, "modifieddate");
            return this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("ModifiedDate >", value, "modifieddate");
            return this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate >=", value, "modifieddate");
            return this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("ModifiedDate <", value, "modifieddate");
            return this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate <=", value, "modifieddate");
            return this;
        }

        public Criteria andModifieddateIn(List values) {
            addCriterion("ModifiedDate in", values, "modifieddate");
            return this;
        }

        public Criteria andModifieddateNotIn(List values) {
            addCriterion("ModifiedDate not in", values, "modifieddate");
            return this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate between", value1, value2, "modifieddate");
            return this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate not between", value1, value2, "modifieddate");
            return this;
        }
    }
}