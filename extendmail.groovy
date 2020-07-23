def call(Map stageParams) {
emailext attachLog: true, body: 'Test mail from shared library', subject: 'Test mail from shared library', to: stageParams.to
}