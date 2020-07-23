def call(Map stageParams) {
emailext attachLog: true, body: 'Test mail from shared library', subject: stageParams.subject, to: stageParams.to
}
