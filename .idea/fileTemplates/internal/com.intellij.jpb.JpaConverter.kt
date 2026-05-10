package ${PACKAGE_NAME}

import ${JPA_PACKAGE}.Converter
import ${JPA_PACKAGE}.AttributeConverter

@Converter #if ( ${AUTO_APPLY} == "true" )(autoApply = true)#end
class ${NAME} : AttributeConverter<${ENTITY_FQN}, ${DB_FQN}> {
    override fun convertToDatabaseColumn(${ENTITY_NAME}: ${ENTITY_FQN}): ${DB_FQN} {
        TODO("Not yet implemented")
    }

    override fun convertToEntityAttribute(${DB_NAME}: ${DB_FQN}): ${ENTITY_FQN} {
        TODO("Not yet implemented")
    }
}