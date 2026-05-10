package fileTemplates.j2ee;package ${PACKAGE_NAME};

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.ImmutableMutabilityPlan;
import org.hibernate.type.descriptor.spi.JdbcRecommendedSqlTypeMappingContext;
  #if ( ${PARAMETRIZED} == "true" )import org.hibernate.usertype.DynamicParameterizedType;#end

import java.util.Properties;

public class ${NAME}Descriptor extends AbstractTypeDescriptor<${TYPE}>  #if ( ${PARAMETRIZED} == "true" )
  implements DynamicParameterizedType #end {

  protected ${NAME}Descriptor() {
    super(${TYPE}. class,new ImmutableMutabilityPlan<>());
  }

  @Override
  public String toString(${TYPE} value) {
    return null;
  }

  @Override
  public ${TYPE} fromString(String string) {
    return null;
  }

  @Override
  public <X> X unwrap(${TYPE} value, Class<X> type, WrapperOptions options) {
    return null;
  }

  @Override
  public <X> ${TYPE} wrap(X value, WrapperOptions options) {
    return null;
  }

  @Override
  public SqlTypeDescriptor getJdbcRecommendedSqlType(JdbcRecommendedSqlTypeMappingContext context) {
    return null;
  }


  #if ( ${PARAMETRIZED} == "true" )
    @Override
    public void setParameterValues(Properties parameters) {

    }
  #end
}
