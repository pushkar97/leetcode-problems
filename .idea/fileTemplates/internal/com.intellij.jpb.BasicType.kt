package ${PACKAGE_NAME}
import org.hibernate.engine.spi.SharedSessionContractImplementor
import org.hibernate.type.AbstractSingleColumnStandardBasicType
import org.hibernate.type.descriptor.sql.BitTypeDescriptor

class ${NAME} : AbstractSingleColumnStandardBasicType<${TYPE}>(${SQL_DESCRIPTOR} #if ( ${CONSTANT_INSTANCE} ==
  "false" )()#end, ${JAVA_TYPE_DESCRIPTOR}()){

    override fun getName(): String  = "${TYPE_NAME}"

    override fun resolve(value: Any, session: SharedSessionContractImplementor, owner: Any, overridingEager: Boolean): Any {
        TODO("Not yet implemented")
    }
}
