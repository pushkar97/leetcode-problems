package ${PACKAGE_NAME}

#if ( ${NO_REPOSITORY_BEAN} == "true" )import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
#end
interface ${NAME}#if($ENTITY_GENERIC_EXPR != "" || $ID_GENERIC_EXPR != "")<#if($ENTITY_GENERIC_EXPR !=
  "")${ENTITY_GENERIC_EXPR}#end#if($ID_GENERIC_EXPR != ""), ${ID_GENERIC_EXPR}#end>#end: ${REPOSITORY_FQN}#if($ENTITY_FQN !=
  "" || $ENTITY_ID_FQN != "")<#if($ENTITY_FQN != "")${ENTITY_FQN}#end#if($ENTITY_ID_FQN !=
  ""), ${ENTITY_ID_FQN}#end>#end #if( ${SPECIFICATION} ==
  "true" ),org.springframework.data.jpa.repository.JpaSpecificationExecutor<${ENTITY_FQN}> #end{
}